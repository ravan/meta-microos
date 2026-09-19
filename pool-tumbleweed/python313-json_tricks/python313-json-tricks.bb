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

RPM_NAME = "python313-json_tricks-3.17.3-3.1.noarch.rpm"
RPM_HASH = "1074a77cfa2e8f1f0e6d869ec2407d2f9c5b975b277fafb3310f5df16928bf2c71e183f6fd92b006d58ba625072bb2f531318538bdfca720fc45e09d9c3e9fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json-tricks \
python3.13dist-json-tricks \
python313-json-tricks \
python3dist-json-tricks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
