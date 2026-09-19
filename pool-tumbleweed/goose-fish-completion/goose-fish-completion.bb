SUMMARY = "Fish completion for goose"
DESCRIPTION = "Fish command line completion support for goose."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & CDLA-Permissive-2.0 & ISC & LGPL-3.0-or-later & MIT & MIT-0 & MPL-2.0 & Unicode-3.0 & Zlib & bzip2-1.0.6"

PV = "1.50.0"

RPM_NAME = "goose-fish-completion-1.50.0-1.1.noarch.rpm"
RPM_HASH = "f3d0c786a475961d7675053f8a78f7916520584f5647684b4187cc9c270eb9a4a7c83a90dd94744029657f6abe10ecd9366b63624a13a8fb20284a9376385eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goose-fish-completion"

RDEPENDS:${PN} += "goose"

inherit rpm
