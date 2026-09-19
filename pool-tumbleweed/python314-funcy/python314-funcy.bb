SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python314-funcy-2.0-3.5.noarch.rpm"
RPM_HASH = "50f53f6b10f074bb0d4a13772b286183007495067fe82a5bd6b1b00574e492086110b062e3d113cc9804a2470c93ca4d447900c0314eb151cc4512de2bf885e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-funcy \
python314-funcy \
python3dist-funcy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
