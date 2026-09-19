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

RPM_NAME = "python313-intelhex-2.3.0-2.5.noarch.rpm"
RPM_HASH = "754ef0b7edad8b2b54697f84eda6c64a1ca95546a1d6c41f3a985deb9a5ab7ce3131bf844023333df421d19439b12b080bfe833ff81cdd33432c999ac4be2fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intelhex \
python3-intelhex \
python3.13dist-intelhex \
python313-intelhex \
python3dist-intelhex"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
