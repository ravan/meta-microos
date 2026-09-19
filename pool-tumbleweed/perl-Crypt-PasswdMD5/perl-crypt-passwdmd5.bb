SUMMARY = "Provide interoperable MD5-based crypt() functions"
DESCRIPTION = "'apache_md5_crypt()' provides a function compatible with Apache's \
'.htpasswd' files. This was contributed by Bryan Hart <bryan@eai.com>. This \
function is exported by default. \
 \
The 'unix_md5_crypt()' provides a crypt()-compatible interface to the \
rather new MD5-based crypt() function found in modern operating systems. \
It's based on the implementation found on FreeBSD 2.2.[56]-RELEASE. This \
function is also exported by default. \
 \
For both functions, if a salt value is not supplied, a random salt will be \
generated, using the function random_md5_salt(). This function is not \
exported by default."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.460.0"

RPM_NAME = "perl-Crypt-PasswdMD5-1.460.0-1.1.noarch.rpm"
RPM_HASH = "a3f1d106f2a6352bc9de88de0dc90c47e4ae331cb952340bd15db0dd83aad0b5ee4450a1ce3ecb6ddebd34923475319c020a2d93a02b0afe4fd8c6b287947ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--PasswdMD5 \
perl-Crypt-PasswdMD5"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--URandom \
perl-Digest--MD5 \
perl-Encode \
perl-Exporter \
perl-ExtUtils--MakeMaker"

inherit rpm
