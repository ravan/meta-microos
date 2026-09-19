SUMMARY = "Provide /usr/bin/pass as drop-in replacement"
DESCRIPTION = "Manage your credentials with ease. In a globally distributed team, on multiple devices or fully offline on an air gapped machine. \
 \
Works everywhere - The same user experience on Linux, MacOS, *BSD or Windows \
Built for teams - Built from our experience working in distributed development teams \
Full autonomy - No network connectivity required, unless you want it \
 \
This package provides a symlink to make this a drop in replacement for password-store."
LICENSE = "MIT"

PV = "1.17.2"

RPM_NAME = "gopass-impersonate-pass-1.17.2-1.1.noarch.rpm"
RPM_HASH = "84ec48df59882e7b5f4c038f6d95b5f305a7c1f212355a4f22c00753e65d5dd7b7ac188bdf87916f16baaaf08387701315bb5dbeddf3b6e0bf36a473482e00a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gopass-impersonate-pass"

RDEPENDS:${PN} += "gopass"

inherit rpm
