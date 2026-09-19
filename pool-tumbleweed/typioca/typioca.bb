SUMMARY = "Minimal terminal based typing speed tester"
DESCRIPTION = "A typing speed tester in the terminal \
 \
Features: \
- Time or word/sentence count based typing speed tests \
- Proper WPM results based on https://www.speedtypingonline.com/typing-equations \
- Multiple word/sentence lists made out of classical books to spice your test up \
- Cursor aware word lines \
- Interactive menu \
- ctrl+w support \
- SSH server typioca serve \
- Dynamic word lists \
- Custom word lists \
- Linux/Mac/Win support"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "typioca-3.1.0-1.13.aarch64.rpm"
RPM_HASH = "132b49114d2371820cae11635c67d8f40aa96565bec3ffc2c26b89ebd7efb8e4c2bf69b93e2513b9991706ad160c9a4b7f864ceeb9a36f6b6456fb4fd7fe66c6"

RPROVIDES:${PN} += "typioca"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
