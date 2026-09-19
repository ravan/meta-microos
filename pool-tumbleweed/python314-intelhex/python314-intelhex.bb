SUMMARY = "Python library for Intel HEX files manipulations"
DESCRIPTION = "The Intel HEX file format is widely used in microprocessors and \
microcontrollers area (embedded systems etc) as the de facto standard \
for representation of code to be programmed into microelectronic \
devices. \
 \
This work implements an ``intelhex`` Python library to read, write, \
create from scratch and manipulate data from Intel HEX file format. \
 \
The distribution package also includes several convenience Python scripts, \
including 'classic' ``hex2bin`` and ``bin2hex`` converters and more, \
those based on the library itself. Check the docs to know more."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python314-intelhex-2.3.0-2.5.noarch.rpm"
RPM_HASH = "290962c3dca00c473d49b1a4f5980a119b4ba0210a17292012a3335f9955b60eafc5067b380719cbe26bc9e140117688a9700f6291d894e5a0a6288da76d70a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intelhex \
python3.14dist-intelhex \
python314-intelhex \
python3dist-intelhex"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
