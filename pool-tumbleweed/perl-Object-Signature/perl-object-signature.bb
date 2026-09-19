SUMMARY = "Generate cryptographic signatures for objects"
DESCRIPTION = "Object::Signature is an abstract base class that you can inherit from in \
order to allow your objects to generate unique cryptographic signatures. \
 \
The method used to generate the signature is based on Storable and \
Digest::MD5. The object is fed to 'Storable::nfreeze' to get a string, \
which is then passed to Digest::MD5::md5_hex to get a unique 32 character \
hexadecimal signature."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Object-Signature-1.08-1.33.noarch.rpm"
RPM_HASH = "5a028b2fc9f437baae3567cde60c7d3cbdedd65ff6537fa65f0df42178f4f32fd0f70aabdbe3ed3f5fbd6e9284dc59257ae79432645986e8f8fbabc644d83735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Object--Signature \
perl-Object--Signature--File \
perl-Object-Signature"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
