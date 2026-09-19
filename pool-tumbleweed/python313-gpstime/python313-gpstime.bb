SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python313-gpstime-0.6.2-2.6.noarch.rpm"
RPM_HASH = "8d89bce41f22cb223fe31f7f44dc69ca1fb24679f4ce407e7e1168259449912e27d87a993af5c690f37fdf2dd34fb7e4b9134334f707cad0b9db487d9f5f04d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gpstime \
python3.13dist-gpstime \
python313-gpstime \
python3dist-gpstime"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-appdirs \
python313-python-dateutil \
python313-requests \
timezone \
update-alternatives"

inherit rpm
