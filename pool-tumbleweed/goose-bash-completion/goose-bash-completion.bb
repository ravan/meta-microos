SUMMARY = "Bash completion for goose"
DESCRIPTION = "Bash command line completion support for goose."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & CDLA-Permissive-2.0 & ISC & LGPL-3.0-or-later & MIT & MIT-0 & MPL-2.0 & Unicode-3.0 & Zlib & bzip2-1.0.6"

PV = "1.50.0"

RPM_NAME = "goose-bash-completion-1.50.0-1.1.noarch.rpm"
RPM_HASH = "8e338fe40920b3ea8709be3c182ea352c56ee50e486f70558150edb0688589190871f730c88c4ff09b06370e3a14d87442f1545d8222342bedc36db6bbdc19d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goose-bash-completion"

RDEPENDS:${PN} += "bash-completion \
goose"

inherit rpm
