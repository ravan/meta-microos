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

RPM_NAME = "python314-macholib-1.16.4-1.4.noarch.rpm"
RPM_HASH = "d08472b8bdc477bbf38f8121a1af400cbcc81a5d1f4823306df26d820260f0e7f107b40a87d55dc06431bb491f19e0778000946a0164738c6692bad46ae4ea55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-macholib \
python314-macholib \
python3dist-macholib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-altgraph"

inherit rpm
