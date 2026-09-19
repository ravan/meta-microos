SUMMARY = "Metapackage that contains the dependencies of os-autoinst-distri-opensuse"
DESCRIPTION = "Metapackage that contains the dependencies of os-autoinst-distri-opensuse."
LICENSE = "MIT"

PV = "1.1770726271.4c22ee70"

RPM_NAME = "os-autoinst-distri-opensuse-deps-1.1770726271.4c22ee70-1.3.noarch.rpm"
RPM_HASH = "25b44533459c73e465f95388f2f80fbd62a15d4b3e4d3d593f073babb270dd617b40181679561bca6459fe46ad441807b43f32120a88d1c554c286ec79de3b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-autoinst-distri-opensuse-deps"

RDEPENDS:${PN} += "/usr/bin/gzip \
golang-github-google-jsonnet \
jq \
mkisofs \
perl-Carp \
perl-Class--Accessor--Fast \
perl-Code--DRY \
perl-Config--Tiny \
perl-Cwd \
perl-Data--Dump \
perl-Data--Dumper \
perl-Date--Parse \
perl-DateTime \
perl-Digest--file \
perl-Exporter \
perl-File--Basename \
perl-File--Copy \
perl-File--Find \
perl-File--Path \
perl-File--Temp \
perl-IO--File \
perl-IO--Socket--INET \
perl-Inline--Python \
perl-LWP--Simple \
perl-List--MoreUtils \
perl-List--Util \
perl-Mojo--Base \
perl-Mojo--File \
perl-Mojo--JSON \
perl-Mojo--UserAgent \
perl-Mojo--Util \
perl-Net--IP \
perl-NetAddr--IP \
perl-POSIX \
perl-Perl--Critic--Community \
perl-Regexp--Common \
perl-Selenium--Chrome \
perl-Selenium--Remote--Driver \
perl-Selenium--Remote--WDKeys \
perl-Selenium--Waiter \
perl-SemVer \
perl-Storable \
perl-Term--ANSIColor \
perl-Test--Assert \
perl-Tie--IxHash \
perl-Time--HiRes \
perl-XML--LibXML \
perl-XML--Simple \
perl-XML--Writer \
perl-YAML--PP \
perl-constant \
perl-parent \
perl-strict \
perl-utf8 \
perl-version \
perl-warnings"

inherit rpm
