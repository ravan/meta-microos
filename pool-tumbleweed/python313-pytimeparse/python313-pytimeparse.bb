SUMMARY = "Time expression parser"
DESCRIPTION = "A small Python library to parse various kinds of time expressions, \
inspired by a StackOverflow question. \
 \
The single function pytimeparse.timeparse.timeparse defined in the \
library (also available as pytimeparse.parse) parses time expressions \
like the following: \
 \
  * 32m \
  * 2h32m \
  * 3d2h32m \
  * 1w3d2h32m \
  * 1w 3d 2h 32m \
  * 1 w 3 d 2 h 32 m \
  * ... \
 \
It returns the time as a number of seconds (an integer value if \
possible, otherwise a floating-point number) \
 \
A number of seconds can be converted back into a string using the \
datetime module in the standard library."
LICENSE = "MIT"

PV = "1.1.8"

RPM_NAME = "python313-pytimeparse-1.1.8-4.5.noarch.rpm"
RPM_HASH = "8a8195fdd0008c240b68bfca55e78875e9072028c5d16576a410aa8b048031e0daa3b528c5349eac1a857de11e940a469a018b777f90938569e850c2772fdffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytimeparse \
python3.13dist-pytimeparse \
python313-pytimeparse \
python3dist-pytimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
