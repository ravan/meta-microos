SUMMARY = "Ruby packaging helpers"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Some helper tools for packaging rubygems and rails apps."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby-packaging-helpers-4.0.0-4.2.noarch.rpm"
RPM_HASH = "3d49f1dbe11df671098c55fb10cc5328c0a7cd847a8c87958936f83be1e7574d1021e80fe1b5d5ef2867ab9d22d43585c363784a7cc2433a77d8ecca615574f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-packaging-helpers"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-common"

inherit rpm
