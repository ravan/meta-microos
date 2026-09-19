SUMMARY = "Extra features for Python's JSON"
DESCRIPTION = "The json_tricks package brings several pieces of functionality to \
python handling of json files: \
 \
1. Store and load numpy arrays in human-readable format. \
2. Store and load class instances both generic and customized. \
3. Store and load date/times as a dictionary (including timezone). \
4. Preserve map order {} using OrderedDict. \
5. Allow for comments in json files by starting lines with #. \
6. Sets, complex numbers, Decimal, Fraction, enums, compression, duplicate keys, ... \
 \
As well as compression and disallowing duplicate keys."
LICENSE = "BSD-3-Clause"

PV = "3.17.3"

RPM_NAME = "python314-json_tricks-3.17.3-3.1.noarch.rpm"
RPM_HASH = "855cf9c0ab833189d44e7b68802a74212714d23fba45a9d2d63acafc2d157f6d34b80ed3c8063a9172a509ba9835f8f026c2b80d55b1394cd30604feb4d12c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-json-tricks \
python314-json-tricks \
python3dist-json-tricks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
