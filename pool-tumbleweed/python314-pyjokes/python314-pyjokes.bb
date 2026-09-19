SUMMARY = "One line jokes for programmers (jokes as a service)"
DESCRIPTION = "This package provides one line jokes for programmers (jokes as a service) \
Simply call `pyjoke` from the command line and use the -c argumnet to get jokes \
from a specific category (neutral/adult/chuck/all). The default is neutral."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python314-pyjokes-0.8.3-1.9.noarch.rpm"
RPM_HASH = "4ff8ff7cb0171350eb83d81b045e4751b16bf0124b5e167cae50e67a8537bace007b2bb219580b0ec0abca63fedb4e9efcd7b6221c005e4ea114ae6c53375c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyjokes \
python314-pyjokes \
python3dist-pyjokes"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
