SUMMARY = "MFILE shared modules"
DESCRIPTION = "This distro consists of general, reusable modules. Currently, there is only \
one module, App::MFILE::HTTP, which is used by App::MFILE::WWW, \
App::Dochazka::WWW, and App::Dochazka::CLI."
LICENSE = "BSD-3-Clause"

PV = "0.182"

RPM_NAME = "perl-App-MFILE-0.182-1.35.noarch.rpm"
RPM_HASH = "492e840ea3fb467d1d21a67a237125b2ddd0ca10dfabf5f2bbd051d74a326483e1f8653b898b1beeca6ee39f7a7d6412fa357b189fabb48b386987782cdbaa94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--MFILE \
perl-App--MFILE--HTTP \
perl-App-MFILE"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-App--CELL \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--UserAgent \
perl-Params--Validate"

inherit rpm
