import com.google.appengine.api.datastore.*

def e = new Entity("person")
e.firstname = 'Marco'
e.lastname = 'Vermeulen'
e.save()


def firstImage = new Entity("GolaImage")
firstImage.imgSrc = "google"
firstImage.searchKey = "pineapple"
firstImage.imgUrl="https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0CAUQjhxqFQoTCPj-rrb79cYCFYedlAodTqMIsg&url=http%3A%2F%2Fwww.nydailynews.com%2Fnew-york%2Ftalking-pineapple-question-state-exam-stumps-article-1.1064657&ei=P1azVbjjI4e70gTOxqKQCw&bvm=bv.98717601,d.dGo&psig=AFQjCNH9ADZnZWX7ntn_kMjVs5XPBjUE9g&ust=1437902780644038"
firstImage.imgSize="37"
firstImage.height="100"
firstImage.width="200"
firstImage.aspectRatio="largewidth"
firstImage.format="jpg"
firstImage.color="yello"
firstImage.type="photo"
firstImage.age="24"
firstImage.license="xyz"
firstImage.save()