(function() {
    'use strict';

    angular
        .module('preventApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider.state('social-register', {
            parent: 'account',
            url: '/social-register/:provider?{success:boolean}',
            data: {
                authorities: [],
                pageTitle: 'Register with {{ label }}'
            },
            views: {
                'content-frontend@frontend': {
                    templateUrl: 'app/account/social/social-register.html',
                    controller: 'SocialRegisterController',
                    controllerAs: 'vm'
                }
            }
        })
        .state('social-auth', {
            parent: 'account',
            url: '/social-auth',
            data: {
                authorities: []
            },
            views: {
                'content-frontend@frontend': {
                    controller: 'SocialAuthController'
                }
            }
        });
    }
})();
