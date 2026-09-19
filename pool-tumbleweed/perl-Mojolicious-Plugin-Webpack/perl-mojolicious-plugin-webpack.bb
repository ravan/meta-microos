SUMMARY = "Mojolicious ♥ Webpack"
DESCRIPTION = "Mojolicious::Plugin::Webpack is a Mojolicious plugin to make it easier to \
work with https://webpack.js.org/ or https://rollupjs.org/. This plugin \
will... \
 \
* 1. \
 \
Generate a minimal 'package.json' and a Webpack or Rollup config file. \
Doing this manually is possible, but it can be quite time consuming to \
figure out all the bits and pieces if you are not already familiar with \
Webpack. \
 \
* 2."
LICENSE = "Artistic-2.0"

PV = "1.02"

RPM_NAME = "perl-Mojolicious-Plugin-Webpack-1.02-2.5.noarch.rpm"
RPM_HASH = "3c0fe44b5882f79b2b8ad097ca2ea0319de187b023bc07f7a3a3374c29b8c795dfcff9cf6fa512b9b1f197da31002d0b0fe06c39be609b458e3271af85ea80a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Alien--npm \
perl-Mojo--Alien--rollup \
perl-Mojo--Alien--webpack \
perl-Mojolicious--Command--Author--webpack \
perl-Mojolicious--Plugin--Webpack \
perl-Mojolicious-Plugin-Webpack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--chdir \
perl-Mojolicious"

inherit rpm
