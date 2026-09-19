SUMMARY = "Make URLs for Gravatars from an email address"
DESCRIPTION = "A Gravatar is a Globally Recognized Avatar for a given email address. This \
allows you to have a global picture associated with your email address. You \
can look up the Gravatar for any email address by constructing a URL to get \
the image from gravatar.com. This module does that. \
 \
Examples of use include the author faces on http://search.cpan.org. \
 \
See http://gravatar.com for more info."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Gravatar-URL-1.07-1.36.noarch.rpm"
RPM_HASH = "f652654750e423809c71aaca6a7a11a4eda10cdcbbfc657ba08d1f24f94d2cd169772ea390d9d4752a35168457c4c0b5c284c6bde74833ea3ce905da68068415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gravatar--URL \
perl-Gravatar-URL \
perl-Libravatar--URL \
perl-Unicornify--URL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest--SHA \
perl-Net--DNS \
perl-URI--Escape \
perl-parent"

inherit rpm
