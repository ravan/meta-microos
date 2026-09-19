SUMMARY = "A help service to work with git repositories in OBS"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "obs-scm-bridge-0.8.0-1.1.noarch.rpm"
RPM_HASH = "619b6d62630fce2a05405d0a567917a41258ad09d540f8d9eace19d1b5d10914dc2a1da672e60f7123227ef7b65be1c7689dbc574cf816a305292a383959702e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-scm-bridge \
obs-scm-bridge"

RDEPENDS:${PN} += "/usr/bin/python3 \
build \
git-core \
git-lfs \
perl-Date--Parse \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Net--SSL \
perl-Pod--Usage \
perl-Time--Zone \
perl-URI \
perl-XML--Parser \
perl-YAML--LibYAML \
python313-PyYAML"

inherit rpm
