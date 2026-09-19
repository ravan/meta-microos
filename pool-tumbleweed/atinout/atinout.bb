SUMMARY = "Utility to communicate with modems via AT commands"
DESCRIPTION = "This program will read a file (or stdin) containing a list of AT \
commands. Each command will be send to the modem, and all the response \
for the command will be output to file (or stdout). \
 \
Example, to hang up an ongoing call: \
 \
$ echo ATH | atinout - /dev/ttyACM0 - \
ATH \
OK \
$"
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "atinout-0.9.1-3.3.aarch64.rpm"
RPM_HASH = "cd956c5367191ed129994274642549200f2af8d436800407f89f60d576b96eea92a584b0cddbd40212e17e58f57eae532927240298c17e2e8239ade6496b3fe5"

RPROVIDES:${PN} += "atinout"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
