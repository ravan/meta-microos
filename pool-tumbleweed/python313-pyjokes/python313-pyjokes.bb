SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python313-pyjokes-0.8.3-1.9.noarch.rpm"
RPM_HASH = "5f6eb5c9d53e705f36e04112ac6a537e126cde8284a15fb9d2120045418e54d684e1838f19998f5f388f3cefe71553c0021228340f79d98a40e7ca1004e214ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjokes \
python3.13dist-pyjokes \
python313-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
