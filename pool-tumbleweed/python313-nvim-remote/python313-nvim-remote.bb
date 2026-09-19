SUMMARY = "Neovim process control utility"
DESCRIPTION = "This package provides an executable called 'nvr' which solves these cases: \
 \
- Controlling nvim processes from the shell, e.g. opening files in another \
  terminal window. \
- Opening files from within `:terminal` without starting a nested nvim process."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python313-nvim-remote-5.0.0-2.3.noarch.rpm"
RPM_HASH = "f263ceac047269fbd0691013799eb2d9c82110f9ad2adcaa31be8798618304794016721569b95d81a418c0f4acb471ee5be13789ca315cec9f766c0ff566fef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nvim-remote \
python3.13dist-nvim-remote \
python313-nvim-remote \
python3dist-nvim-remote"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-neovim \
python313-psutil \
update-alternatives"

inherit rpm
