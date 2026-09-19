SUMMARY = "Comments that do more than just sit there"
DESCRIPTION = "Smart comments provide an easy way to insert debugging and tracking code \
into a program. They can report the value of a variable, track the progress \
of a loop, and verify that particular assertions are true. \
 \
Best of all, when you're finished debugging, you don't have to remove them. \
Simply commenting out the 'use Smart::Comments' line turns them back into \
regular comments. Leaving smart comments in your code is smart because if \
you needed them once, you'll almost certainly need them again later."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.06"

RPM_NAME = "perl-Smart-Comments-1.06-1.41.noarch.rpm"
RPM_HASH = "93146ebb4547cac0a152f1dc9cb68b800b4aa0f4abfbfce490823cc9c0eb23ea795e0070a0e2c361e76ced5fe5861a5e9aba2554944e630b2d5f984bcefb88cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Smart--Comments \
perl-Smart-Comments"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
