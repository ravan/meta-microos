SUMMARY = "Captures the output of subprocesses in real-time"
DESCRIPTION = "This package provides a drop-in alternative to `subprocess.run` that \
captures the output while still printing it in real-time, just the way \
`tee` does. \
 \
Printing output in real-time while still capturing is valuable for \
any tool that executes long-running child processes. For those, you do want \
to provide instant feedback (progress) related to what is happening."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python314-subprocess-tee-0.4.2-1.5.noarch.rpm"
RPM_HASH = "f1eab1a684cdc51571d0cd3e2393d5a763f0a17cf93d36fa17d412162dc27380ae327c6eb5888402385b9d1891a0b5e395dd87080d1ee120ad56160771a07855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-subprocess-tee \
python314-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
