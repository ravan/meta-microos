SUMMARY = "Tool for selecting and copying text from stdin without a mouse"
DESCRIPTION = "Read input from stdin and display a selection interface that allows a field \
to be selected and copied to the clipboard. Fields are either recognized by \
a regular expression using the -g option or by splitting the input on a \
delimiter sequence using the -d option."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "yank-1.3.0-1.14.aarch64.rpm"
RPM_HASH = "93581568797e3cd9b4ad66ab987dcf5b79bdfbb4cfcaba5cd4fa0f2884da5892f98dc3a33c851a885eec376474938c45a7ca91fb1883a96ade85d9d5c644f72a"

RPROVIDES:${PN} += "yank"

RDEPENDS:${PN} += "bash \
libc.so.6"

inherit rpm
