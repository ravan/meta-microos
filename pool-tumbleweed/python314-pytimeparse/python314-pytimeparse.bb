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

RPM_NAME = "python314-pytimeparse-1.1.8-4.5.noarch.rpm"
RPM_HASH = "e171f2b51f4ea0cc7a74f6ec60bc612a4d75a153252eb1de4ea5198ee374ee3a13df9cec11b50cc8de6ab45e3ec266250d2afc0a394f0ee9a74ce00aa27b2046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytimeparse \
python314-pytimeparse \
python3dist-pytimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
