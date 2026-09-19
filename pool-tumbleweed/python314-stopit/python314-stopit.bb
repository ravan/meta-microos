SUMMARY = "Timeout control decorator and context managers"
DESCRIPTION = "python314-stopit is a python module that provides: \
* a function that raises an exception in another thread, including the main thread. \
* two context managers that may stop its inner block activity on timeout. \
* two decorators that may stop its decorated callables on timeout."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-stopit-1.1.2-1.7.noarch.rpm"
RPM_HASH = "8145633de274cd12a6174798c9ba1a938af716c18a1d819793ec660e0ca6600e46c5cbab7745b2d6631d0f5503e48484be14a9ad833636653777dfe010110e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stopit \
python314-stopit \
python3dist-stopit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
