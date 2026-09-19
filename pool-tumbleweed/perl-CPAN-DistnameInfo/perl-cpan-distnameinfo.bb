SUMMARY = "Extract distribution name and version from a distribution filename"
DESCRIPTION = "Many online services that are centered around CPAN attempt to associate \
multiple uploads by extracting a distribution name from the filename of the \
upload. For most distributions this is easy as they have used \
ExtUtils::MakeMaker or Module::Build to create the distribution, which \
results in a uniform name. But sadly not all uploads are created in this \
way. \
 \
'CPAN::DistnameInfo' uses heuristics that have been learnt by \
http://search.cpan.org/ to extract the distribution name and version from \
filenames and also report if the version is to be treated as a developer \
release \
 \
The constructor takes a single pathname, returning an object with the \
following methods \
 \
* cpanid \
 \
If the path given looked like a CPAN authors directory path, then this will \
be the the CPAN id of the author. \
 \
* dist \
 \
The name of the distribution \
 \
* distvname \
 \
The file name with any suffix and leading directory names removed \
 \
* filename \
 \
If the path given looked like a CPAN authors directory path, then this will \
be the path to the file relative to the detected CPAN author directory. \
Otherwise it is the path that was passed in. \
 \
* maturity \
 \
The maturity of the distribution. This will be either 'released' or \
'developer' \
 \
* extension \
 \
The extension of the distribution, often used to denote the archive type \
(e.g. 'tar.gz') \
 \
* pathname \
 \
The pathname that was passed to the constructor when creating the object. \
 \
* properties \
 \
This will return a list of key-value pairs, suitable for assigning to a \
hash, for the known properties. \
 \
* version \
 \
The extracted version"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.120.0"

RPM_NAME = "perl-CPAN-DistnameInfo-0.120.0-1.7.noarch.rpm"
RPM_HASH = "3c3176fb951f7c8e94fe2529519c24f9134aa171cdd0e30c86afc58ceda54cd4dc137d2a79f23e3d48dac7ef633da5aea7ac250fd0feca4c1a3da707899df980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--DistnameInfo \
perl-CPAN-DistnameInfo"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
