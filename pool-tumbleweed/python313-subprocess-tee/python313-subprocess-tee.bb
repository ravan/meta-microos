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

RPM_NAME = "python313-subprocess-tee-0.4.2-1.5.noarch.rpm"
RPM_HASH = "02017087205eb73cb6b2e92b8e3448de0f62e10c02358d2f5698efe4e1fae7351f1e54ec54c41655ea45eef5f34242074f78ed79c7fd3b1ab3b384ca6f414ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocess-tee \
python3.13dist-subprocess-tee \
python313-subprocess-tee \
python3dist-subprocess-tee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
