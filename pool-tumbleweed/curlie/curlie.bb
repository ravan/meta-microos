SUMMARY = "a frontend to curl that adds the ease of use of httpie"
DESCRIPTION = "If you like the interface of HTTPie but miss the features of curl, curlie is what you are searching for. Curlie is a frontend to curl that adds the ease of use of httpie, without compromising on features and performance. All curl options are exposed with syntax sugar and output formatting inspired from httpie."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "curlie-1.8.2-1.8.aarch64.rpm"
RPM_HASH = "2e1452bae3c8d3e204e62b5279cc0791b673462ede25d10db7a6f0fbe771d07eaac500be56199632a39724841adb127c69f6e9daeb34637c8d2bc85726ac4ecb"

RPROVIDES:${PN} += "curlie"

RDEPENDS:${PN} += ""

inherit rpm
