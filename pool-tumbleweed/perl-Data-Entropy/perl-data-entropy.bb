SUMMARY = "Entropy (randomness) management"
DESCRIPTION = "This module maintains a concept of a current selection of entropy source. \
Algorithms that require entropy, such as those in \
Data::Entropy::Algorithms, can use the source nominated by this module, \
avoiding the need for entropy source objects to be explicitly passed \
around. This is convenient because usually one entropy source will be used \
for an entire program run and so an explicit entropy source parameter would \
rarely vary. There is also a default entropy source, avoiding the need to \
explicitly configure a source at all. \
 \
If nothing is done to set a source then it defaults to the use of Rijndael \
(AES) in counter mode (see Data::Entropy::RawSource::CryptCounter and \
Crypt::Rijndael), keyed using Crypt::URandom."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.8.0"

RPM_NAME = "perl-Data-Entropy-0.8.0-1.8.noarch.rpm"
RPM_HASH = "1df32845797acb3c6c08fbbb8e50a9cbdaf696ca02d3ebab7baa895ed326d8abb8a194f11fd699ab90145f2f0dcbf7cbeb14bf2d4fcea859f08d9855f6417a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Entropy \
perl-Data--Entropy--Algorithms \
perl-Data--Entropy--RawSource--CryptCounter \
perl-Data--Entropy--RawSource--Local \
perl-Data--Entropy--RawSource--RandomOrg \
perl-Data--Entropy--RawSource--RandomnumbersInfo \
perl-Data--Entropy--Source \
perl-Data-Entropy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--Rijndael \
perl-Crypt--URandom \
perl-Data--Float \
perl-HTTP--Lite \
perl-Module--Build \
perl-Params--Classify \
perl-parent"

inherit rpm
