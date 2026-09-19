SUMMARY = "Open a browser in a given URL"
DESCRIPTION = "The functions optionaly exported by this module allows you to open URLs in \
the user browser. \
 \
A set of known commands per OS-name is tested for presence, and the first \
one found is executed. With an optional parameter, all known commands are \
checked. \
 \
The 'open_browser' uses the 'system()' function to execute the command. If \
you want more control, you can get the command with the 'open_browser_cmd' \
or 'open_browser_cmd_all' functions and then use whatever method you want \
to execute it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40.0"

RPM_NAME = "perl-Browser-Open-0.40.0-1.7.noarch.rpm"
RPM_HASH = "066511b4e4bbd868d38420b785f58fe8b794dfff98915dbcb54f7e77e416ecc28ef9351e0e742da00479d0b2eb0f574c0a9ba0a5ee397e06a0cd7ab6623fdaac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Browser--Open \
perl-Browser-Open"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More \
perl-parent"

inherit rpm
