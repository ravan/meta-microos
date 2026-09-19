SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-pyicumessageformat-1.0.0-1.28.noarch.rpm"
RPM_HASH = "d7a2b0b287828ba43d15c552222a220a6cde681dbe3ba66bc9e2158a176b980aac0560ea3d01e9e49ae307bd3779ade32406353394b7d857a517f91842e3437f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyicumessageformat \
python314-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
