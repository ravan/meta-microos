SUMMARY = "Determine file types"
DESCRIPTION = "This module can be used to determine the mime type of a file. It tries to \
implement the freedesktop specification for a shared MIME database. \
 \
For this module shared-mime-info-spec 0.13 was used. \
 \
This package only uses the globs file. No real magic checking is used. The \
File::MimeInfo::Magic package is provided for magic typing. \
 \
If you want to determine the mimetype of data in a memory buffer you should \
use File::MimeInfo::Magic in combination with IO::Scalar. \
 \
This module loads the various data files when needed. If you want to hash \
data earlier see the 'rehash' methods below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.370.0"

RPM_NAME = "perl-File-MimeInfo-0.370.0-1.3.noarch.rpm"
RPM_HASH = "165d051e4f0b93f92aeeec99f1036a94ca14b2590564be6e9ac53efad8795a69ae69a117493daba756a6c9c021d64ac65b459ac812ab76767549d07ab6388d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--MimeInfo \
perl-File--MimeInfo--Applications \
perl-File--MimeInfo--Magic \
perl-File--MimeInfo--Rox \
perl-File-MimeInfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Encode--Locale \
perl-File--BaseDir \
perl-File--DesktopEntry \
shared-mime-info"

inherit rpm
