SUMMARY = "Documentation for difftastic"
DESCRIPTION = "This package contains the documentation for difftastic."
LICENSE = "Apache-2.0 & MIT"

PV = "0.70.0"

RPM_NAME = "difftastic-doc-0.70.0-1.2.noarch.rpm"
RPM_HASH = "d579be392e778ee9a90e129bbb92de239217560ab8c8aa135e61aafb24bd9b94e9ae1595c0348db8a105ca16864f33483b585f682b98e5c5e8b43f8a1c40ea03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "difftastic-doc"

RDEPENDS:${PN} += ""

inherit rpm
