SUMMARY = "A utility belt library for JavaScript"
DESCRIPTION = "Underscore.js is a utility belt library for JavaScript that provides support \
for the usual functional suspects (each, map, reduce, filter...) without \
extending any core JavaScript objects."
LICENSE = "MIT"

PV = "1.13.6"

RPM_NAME = "nodejs-underscore-1.13.6-1.13.noarch.rpm"
RPM_HASH = "9e0ff3311bbb76dce470d1aad2a03fb753723fb62c67fbc7d6eddf568854a59a35a1bc0fd7722096971384b04c33a34463c4c20c114f7afe8915f8426a6b8119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-underscore \
npm-underscore"

RDEPENDS:${PN} += ""

inherit rpm
