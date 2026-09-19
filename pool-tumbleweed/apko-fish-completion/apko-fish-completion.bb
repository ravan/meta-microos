SUMMARY = "Fish Completion for apko"
DESCRIPTION = "Fish command line completion support for apko."
LICENSE = "Apache-2.0"

PV = "1.2.41"

RPM_NAME = "apko-fish-completion-1.2.41-1.1.noarch.rpm"
RPM_HASH = "6e676eee60ef797fda61181b9f2b6e34a4bcfb6f2f761fb1804333f06d9bbbc427743628a24d1a648b92a87762006f469b838b190fd302fc32df1ec618346ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apko-fish-completion"

RDEPENDS:${PN} += "apko"

inherit rpm
