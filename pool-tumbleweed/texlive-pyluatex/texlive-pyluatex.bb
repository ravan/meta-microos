SUMMARY = "Execute Python code on the fly in your LaTeX documents"
DESCRIPTION = "PyLuaTeX allows you to execute Python code and to include the \
resulting output in your LaTeX documents in a single \
compilation run. LaTeX documents must be compiled with LuaLaTeX \
for this to work. PyLuaTeX runs a Python InteractiveInterpreter \
(actually several if you use different sessions) in the \
background for on-the-fly code execution. Python code from your \
LaTeX file is sent to the background interpreter through a TCP \
socket. This approach allows your Python code to be executed \
and the output to be integrated in your LaTeX file in a single \
compilation run. No additional processing steps are needed. No \
intermediate files have to be written. No placeholders have to \
be inserted."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.3svn77682"

RPM_NAME = "texlive-pyluatex-2026.226.0.0.6.3svn77682-60.4.noarch.rpm"
RPM_HASH = "f3cfefe13ffab3d3dd894e29c5a6cbb327bd30cae35f78cb7adfad48212df170d7e0edb08e9d9c1e11ee09d2a04ec44a24638e5c2c567e8de913c2c29607da3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pyluatex.sty \
texlive-pyluatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
