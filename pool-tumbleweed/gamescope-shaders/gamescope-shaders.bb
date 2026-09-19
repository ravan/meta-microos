SUMMARY = "Reshade shaders packaged with Gamescope"
DESCRIPTION = "This package provides reshade shaders packaged with Gamescope."
LICENSE = "GPL-3.0"

PV = "0.1+git2.64d7a05"

RPM_NAME = "gamescope-shaders-0.1+git2.64d7a05-1.3.noarch.rpm"
RPM_HASH = "084be381b9aa728287585ea001c6f69186eec9ea42cfdaf17c2330b9cfdc9ce5c7b22d909f7853b8b1b44623a5bc1ece97081ac22dcf881a610a11a6a66612a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "GamescopeShaders \
gamescope-shaders"

RDEPENDS:${PN} += "/usr/bin/sh \
gamescope"

inherit rpm
