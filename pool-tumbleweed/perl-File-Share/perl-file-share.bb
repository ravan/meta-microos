SUMMARY = "Extend File::ShareDir to Local Libraries"
DESCRIPTION = "This module is a dropin replacement for File::ShareDir. It supports the \
'dist_dir' and 'dist_file' functions, except these functions have been \
enhanced to understand when the developer's local './share/' directory \
should be used. \
 \
NOTE: module_dist and module_file are not yet supported, because (afaik) \
there is no well known way to populate per-module share files. This may \
change in the future. Please contact me if you know how to do this."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.27"

RPM_NAME = "perl-File-Share-0.27-1.18.noarch.rpm"
RPM_HASH = "a66478060aeaa0707b68bc773b321c6ada1ec8463b85355c4409d53cb723a070a13fa5ee79d4056bb55c877a47e63b30b78c20352fd4e9d458ed67960924dc94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Share \
perl-File-Share"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir \
perl-Readonly"

inherit rpm
