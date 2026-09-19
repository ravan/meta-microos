SUMMARY = "A decorator to automatically detect mismatch when overriding a method"
DESCRIPTION = "A decorator @override that verifies that a method that should override \
an inherited method actually does it. \
 \
Copies the docstring of the inherited method to the overridden method. \
 \
Since signature validation and docstring inheritance are performed on \
class creation and not on class instantiation, this library significantly \
improves the safety and experience of creating class hierarchies in Python \
without significantly impacting performance. \
See https://stackoverflow.com/q/1167617 for the initial inspiration for \
this library."
LICENSE = "Apache-2.0"

PV = "7.7.0"

RPM_NAME = "python313-overrides-7.7.0-2.9.noarch.rpm"
RPM_HASH = "2397f20fe182e4fa3309a3cc0f63b5cae2434ba6b03adfe26d4eb44e5aedb615992668ddff20a40edd1029b7ed8f69b80d30eed8fb2d7c289a692263c8c31aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-overrides \
python3.13dist-overrides \
python313-overrides \
python3dist-overrides"

RDEPENDS:${PN} += "python-abi"

inherit rpm
