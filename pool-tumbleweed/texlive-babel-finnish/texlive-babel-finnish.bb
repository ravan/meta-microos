SUMMARY = "Babel support for Finnish"
DESCRIPTION = "The package provides a language description file that enables \
support of Finnish with babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3ssvn77682"

RPM_NAME = "texlive-babel-finnish-2026.226.1.3ssvn77682-60.2.noarch.rpm"
RPM_HASH = "8a565e4b1c135fcba2238b7df5bc43ed15a1d6dc9d5785d9c9593eefe71235f569dce1df865ddc343ccafc9cb9a77ed35c3fa8286e77d74d755e804f48eac5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-finnish.ldf \
texlive-babel-finnish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
