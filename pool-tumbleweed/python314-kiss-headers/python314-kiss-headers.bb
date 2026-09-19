SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python314-kiss-headers-2.5.0-1.3.noarch.rpm"
RPM_HASH = "cd088e90df82725c4b47c705b03870ac110f42e678571803ab0796b948012810f3cb83962f67044b05bdcc859dd0a694398a967fb4c5df88a0b7f0cbfbabf6c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kiss-headers \
python314-kiss-headers \
python3dist-kiss-headers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
