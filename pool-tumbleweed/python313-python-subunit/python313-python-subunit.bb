SUMMARY = "Streaming protocol for test results"
DESCRIPTION = "Subunit is a streaming protocol for test results.  The protocol is a \
binary encoding that is generated and parsed.  By design, all the \
components of the protocol conceptually fit into the xUnit TestCase -> \
TestResult interaction. \
 \
Subunit comes with command line filters to process a subunit stream and \
language bindings for Python, C, C++ and Shell. Bindings can be \
written for other languages. \
 \
A number of useful things can be done easily with subunit: \
- Test aggregation: Tests run separately can be combined and then \
  reported/displayed together.  For instance, tests from different \
  languages can be shown as a seamless whole. \
- Test archiving: A test run may be recorded and replayed later. \
- Test isolation: Tests that may crash or otherwise interact badly with \
  each other can be run separately and then aggregated, rather than \
  interfering with each other. \
- Grid testing: subunit can act as the necessary serialization and \
  deserialization to get test runs on distributed machines to be \
  reported in real time."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python313-python-subunit-1.4.6-1.2.noarch.rpm"
RPM_HASH = "19e4d06215b26b08be27b08074444cf551d474ce1afd4a24ffe5224503c241a6af476aa05050e3a742e9fe26e33db74ca0a194ff93a4caddfaceff3de5a7bf3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-subunit \
python3.13dist-python-subunit \
python313-python-subunit \
python3dist-python-subunit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python313-iso8601 \
python313-testtools"

inherit rpm
