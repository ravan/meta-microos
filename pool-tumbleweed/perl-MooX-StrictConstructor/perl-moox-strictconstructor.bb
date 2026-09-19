SUMMARY = "Make your Moo-based object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it dies. This is a great way to catch small typos."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13.0"

RPM_NAME = "perl-MooX-StrictConstructor-0.13.0-1.10.noarch.rpm"
RPM_HASH = "48d72e818ed05d39bcdd51a1da8cba061ded4e04499fb5986ab74726038a5c5d25d66659ace494189f02686887ee9917db4f7715c47862c624ea1cb66bf67af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--StrictConstructor \
perl-MooX--StrictConstructor--Role--BuildAll \
perl-MooX--StrictConstructor--Role--Constructor \
perl-MooX--StrictConstructor--Role--Constructor--Base \
perl-MooX--StrictConstructor--Role--Constructor--Late \
perl-MooX-StrictConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo \
perl-Moo--Role"

inherit rpm
