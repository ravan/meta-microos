SUMMARY = "Support for Ruby on Rails development"
DESCRIPTION = "This plugin offers the many features for Ruby on Rails application development."
LICENSE = "Vim"

PV = "5.2"

RPM_NAME = "vim-plugin-rails-5.2-64.2.noarch.rpm"
RPM_HASH = "d7233859ea61d8b310a9b50475ff66f969b144abac2f22c81cd86ba49d5f90da4cf7c77541d12c66409415372152a88058d525a7e7502387197823f3c84e382e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-rails"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
