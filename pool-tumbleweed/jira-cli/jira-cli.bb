SUMMARY = "CLI tool for Atlassian JIRA inspired by the Github CLI tool"
DESCRIPTION = "JiraCLI is an interactive command line tool for Atlassian Jira that will help \
you avoid Jira UI to some extent. This tool is not yet considered complete but \
has all the essential features required to improve your workflow with Jira. The \
tool started with the idea of making issue search and navigation as \
straightforward as possible. The tool now includes all necessary features like \
issue creation, cloning, linking, ticket transition, and much more. The TUI is \
heavily inspired by the GitHub CLI."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "jira-cli-1.6.0-1.8.aarch64.rpm"
RPM_HASH = "b2bae2589280b33780f8106b5aa7eb11cd3e8a0628e4447b2f6fa87de7a171f156165d5b3a26cd4069aa244727401d4653793eec30a4cd1e52c854255c5d9d2f"

RPROVIDES:${PN} += "jira-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
