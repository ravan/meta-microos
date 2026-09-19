SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "2.0.post1"

RPM_NAME = "python314-scripttest-2.0.post1-1.2.noarch.rpm"
RPM_HASH = "83d93d3c423a441109f2be28509aeabebfe99ded07aa75843bac46bbca422d47ab59e739e707999732da3ecc72b4ea3dac2a0b1f41369bf54b0d42596f6bf3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scripttest \
python314-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
