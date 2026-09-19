SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python313-multivolumefile-0.2.3-3.10.noarch.rpm"
RPM_HASH = "eeba2b57ab0ae03c6864a2985abb0f06d8ca888eb899659a7d8bf321e3ed86253a983037ea6eb553b158bdac50ae0e112338f3c8c3f2e6a546cec513981fc231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multivolumefile \
python3.13dist-multivolumefile \
python313-multivolumefile \
python3dist-multivolumefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
