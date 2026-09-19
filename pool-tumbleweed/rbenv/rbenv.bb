SUMMARY = "Simple Ruby version Management"
DESCRIPTION = "rbenv does… \
 \
- Let you change the global Ruby version on a per-user basis. \
- Provide support for per-project Ruby versions. \
- Allow you to override the Ruby version with an environment variable. \
 \
In contrast with rvm, rbenv does not… \
 \
- Need to be loaded into your shell. Instead, rbenv's shim approach works by adding a directory to your $PATH. \
- Override shell commands like cd. That's dangerous and error-prone. \
- Have a configuration file. There's nothing to configure except which version of Ruby you want to use. \
- Install Ruby. You can build and install Ruby yourself, or use ruby-build to automate the process. \
- Manage gemsets. Bundler is a better way to manage application dependencies. If you have projects that are not yet using Bundler you can install the rbenv-gemset plugin. \
- Require changes to Ruby libraries for compatibility. The simplicity of rbenv means as long as it's in your $PATH, nothing else needs to know about it. \
- Prompt you with warnings when you switch to a project. Instead of executing arbitrary code, rbenv reads just the version name from each project. There's nothing to 'trust.'"
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "rbenv-1.3.2-1.6.noarch.rpm"
RPM_HASH = "dc962593992571bf89240c9690c748d2966d6857a42cd21d308aec37f913edf2655d2101c92c09a42df096b41c22a910ce28b96a17c3e861f8878aea49e625e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv"

RDEPENDS:${PN} += "/usr/bin/bash \
procps"

inherit rpm
