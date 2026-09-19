SUMMARY = "Tools for Manipulating PostScript Files"
DESCRIPTION = "This archive contains utilities for manipulating PostScript documents. \
Page selection and rearrangement are supported, including arrangement \
into signatures for booklet printing, and page merging for n-up \
printing. \
 \
psbook      rearranges pages into signatures \
 \
psselect    selects pages and page ranges \
 \
pstops      performs general page rearrangement and selection \
 \
psnup       put multiple pages per physical sheet of paper \
 \
psresize    alter document paper size \
 \
epsffit     fits an EPSF file to a given bounding box \
 \
You will find a README in /usr/share/doc/packages/psutils/ which also \
describes several Perl scripts for importing PostScript files. A manual \
page for each ps utility is also included."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.17"

RPM_NAME = "psutils-3.3.17-1.1.aarch64.rpm"
RPM_HASH = "d5f7c51ffcdd6db2438f9d456cc3319da98398c24cc69fe3dfc6c83312c77e40ce9020965c30f0d9bfca95ced7ce2188f605156535b1ad694890c72f3fdf20fe"

RPROVIDES:${PN} += "psutils \
python3.13dist-psutils \
python3dist-psutils"

RDEPENDS:${PN} += "/usr/bin/python3 \
libpaper-tools \
python-abi \
python3-puremagic \
python3-pypdf"

inherit rpm
