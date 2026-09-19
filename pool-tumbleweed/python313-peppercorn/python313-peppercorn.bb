SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python313-peppercorn-0.6-5.7.noarch.rpm"
RPM_HASH = "57afefea2f09894c6fad23144816821a81320334d5353b1244035a1570f18282c094824629b469905eb49a0ce1639d801a72c83c7ee466bb76a0fb5c70933e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-peppercorn \
python3.13dist-peppercorn \
python313-peppercorn \
python3dist-peppercorn"

RDEPENDS:${PN} += "python-abi \
python313-legacy-cgi"

inherit rpm
