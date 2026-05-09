def gitDownload(repo) 
{
    git "https://github.com/kavali5096-pixel/${repo}.git"

}

def buildArtifact()
{
    sh 'mvn package' 
    
}
