SUMMARY = "Mach-O header analysis and editing"
DESCRIPTION = "macholib can be used to analyze and edit Mach-O headers, the executable \
format used by Mac OS X. \
 \
It's typically used as a dependency analysis tool, and also to rewrite dylib \
references in Mach-O headers to be @executable_path relative. \
 \
Though this tool targets a platform specific file format, it is pure python \
code that is platform and endian independent."
LICENSE = "MIT"

PV = "1.16.4"

RPM_NAME = "python313-macholib-1.16.4-1.4.noarch.rpm"
RPM_HASH = "ae4ac0a9a6fc72cf313b8226956d9fa67efcbb553eb1a8415c007115dd9ed4543a492810d2a35521fa3f736ee02a991ff9928bdc5c73c59419e3b5f9a430ec93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-macholib \
python3.13dist-macholib \
python313-macholib \
python3dist-macholib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-altgraph"

inherit rpm
