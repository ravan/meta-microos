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

RPM_NAME = "python314-overrides-7.7.0-2.9.noarch.rpm"
RPM_HASH = "01321e4c392ce6c64b76eb5541cf3708389374de943feeb636d7c17f0a3b92bb6a9459b45d9ad5d36d59e9e99023a22e743eec5f8ca19a332eb31e4c4e7dcd3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-overrides \
python314-overrides \
python3dist-overrides"

RDEPENDS:${PN} += "python-abi"

inherit rpm
